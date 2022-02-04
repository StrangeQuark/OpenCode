package com.t7s.opencode.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class Users implements UserDetails {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String username;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    private Boolean isLocked = false;
    private Boolean isEnabled = false;
    @ElementCollection
    private List<Long> questionsAttempted;
    @ElementCollection
    private List<Long> questionsCompleted;

    public Users() {

    }

    public Users(String username, String password, String email, UserRole role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.questionsAttempted = new ArrayList<Long>();
        this.questionsCompleted = new ArrayList<Long>();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !isLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public List<Long> getQuestionsAttempted() {
        return questionsAttempted;
    }

    public void setQuestionsAttempted(List<Long> questionsAttempted) {
        this.questionsAttempted = questionsAttempted;
    }

    public void addToQuestionsAttempted(Long s) {
        this.questionsAttempted.add(s);
    }

    public void removeFromQuestionsAttempted(Long s) {
        if(this.questionsAttempted.contains(s))
            this.questionsAttempted.remove(s);
    }

    public List<Long> getQuestionsCompleted() {
        return questionsCompleted;
    }

    public void setQuestionsCompleted(List<Long> questionsCompleted) {
        this.questionsCompleted = questionsCompleted;
    }

    public void addToQuestionsCompleted(Long s) {
        this.questionsCompleted.add(s);
    }

    public void removeFromQuestionsCompleted(Long s) {
        if(this.questionsCompleted.contains(s))
            this.questionsCompleted.remove(s);
    }
}