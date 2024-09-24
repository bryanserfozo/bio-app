package com.fnma.models;

import jakarta.persistence.*;

@Entity
@Table(name = "bios")
public class Bio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String bio;

    public Bio() {
    }

    public int getBioId() {
        return bioId;
    }

    public void setBioId(int bioId) {
        this.bioId = bioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
