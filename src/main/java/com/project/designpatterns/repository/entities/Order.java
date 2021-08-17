package com.project.designpatterns.repository.entities;

import lombok.Data;
import lombok.ToString;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ToString
@Builder
@Entity(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders", uniqueConstraints = @UniqueConstraint(columnNames = {"lastName", "firstName"}))
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Length(min = 2, max = 100)
    @NotNull
    @Column
    private String lastName;

    @Length(min = 2, max = 100)
    @NotNull
    @Column
    private String firstName;

    @NotNull
    @Column(unique = false)
    private String orderType;

}
