package com.himanshu.store.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

/*
 We have to use the annotation in terms to  findout like which class is doing what
 For eg : We have added the annotation to flag so that hibernate gets to know ki what
 is the use of thie particular  class.

 Similarly while transforming exsiting class and feilds also needs to be get updated like
 kaise samjhega ki konsi feild ka kya use case hai so we need that.
* */
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;
    private String category;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    @Column(nullable = false)
    private BigDecimal price;

    @NotNull(message = "Stock Quantity is required!!")
    @Min(value =0,message = "Stock cannot be less than 0")
    @Column(name = "stock_quantity",nullable = false)
    private Integer stockQuantity;

    // Adding relations between the items.
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;

}