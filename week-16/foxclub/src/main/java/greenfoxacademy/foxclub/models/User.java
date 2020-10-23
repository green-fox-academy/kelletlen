package greenfoxacademy.foxclub.models;

import javax.persistence.*;

@Entity
public class User {
  @Id
  @GeneratedValue
   long id;

  @Column
  String username;

  @Column
  String password;

  @OneToOne
  Fox fox;

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Fox getFox() {
    return fox;
  }

  public void setFox(Fox fox) {
    this.fox = fox;
  }
}
