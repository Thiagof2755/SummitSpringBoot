package org.uniube.summit.repositories.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "image")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "image_seq")
    @SequenceGenerator(name = "image_seq", sequenceName = "image_seq", allocationSize=1)
    private Long id;
    @Lob
    @Column(length = 400000)
    private String file;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", file=" + file +
                '}';
    }
}
