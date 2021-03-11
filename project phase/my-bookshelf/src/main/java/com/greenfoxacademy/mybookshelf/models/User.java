package com.greenfoxacademy.mybookshelf.models;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  private String username;

  @Column
  private String password;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private List<Copy> bookShelf = new ArrayList<>();

  @ManyToMany
  private Set<User> friends = new HashSet<>();

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Set<Role> roles = new HashSet<>();

  public Collection<? extends GrantedAuthority> getAuthorities() {
    Set<Role> roles = this.getRoles();
    List<SimpleGrantedAuthority> authorities = new ArrayList<>();
    for (Role role : roles) {
      authorities.add(new SimpleGrantedAuthority(role.getName()));
    }
    return authorities;
  }

  public void addToBookShelf (Copy copy) {
    this.bookShelf.add(copy);
  }

  public void addToRoles(Role newRole) {
    this.roles.add(newRole);
  }
}
