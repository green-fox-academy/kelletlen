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
  private long id;

  @Column
  private String username;

  @Column
  private String password;

  @OneToMany
  private List<Copy> bookShelf = new ArrayList<>();

  @ManyToMany
  private Set<User> friends = new HashSet<>();

  public Collection<? extends GrantedAuthority> getAuthorities() {
    List<SimpleGrantedAuthority> authorities = new ArrayList<>();
    return authorities;
  }
}
