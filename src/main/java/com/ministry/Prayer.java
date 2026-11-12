package com.ministry;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Prayer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String type;
    @Column(length = 2000)
    private String message;
    private LocalDateTime createdAt = LocalDateTime.now();
    private boolean prayedFor = false;
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public String getPhone(){return phone;}
    public void setPhone(String p){this.phone=p;}
    public String getType(){return type;}
    public void setType(String t){this.type=t;}
    public String getMessage(){return message;}
    public void setMessage(String m){this.message=m;}
    public LocalDateTime getCreatedAt(){return createdAt;}
    public void setCreatedAt(LocalDateTime c){this.createdAt=c;}
    public boolean isPrayedFor(){return prayedFor;}
    public void setPrayedFor(boolean p){this.prayedFor=p;}
}
