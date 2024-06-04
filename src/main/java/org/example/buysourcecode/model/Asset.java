package org.example.buysourcecode.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "assets")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36)
    private String id;

    @Column(nullable = false, length = 32)
    private String name;

    @Column(nullable = false, length = 255)
    private String path;

    @Column(nullable = false, length = 16)
    private String type;

    @Column(nullable = false)
    private Long size;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name ="created_at", nullable = false)
    private Long createdAt;

    @Column(name ="updated_at", nullable = false)
    private Long updatedAt;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

}
