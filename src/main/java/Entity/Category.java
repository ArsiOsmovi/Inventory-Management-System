package Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createAT;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAT;

    public Category(Long id) {
        this.id = id;
    }

    public Category() {

    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateAT() {
        return createAT;
    }

    public LocalDateTime getUpdatedAT() {
        return updatedAT;
    }
}
