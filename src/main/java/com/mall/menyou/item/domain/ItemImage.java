package com.mall.menyou.item.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Builder


public class ItemImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageName;

    private String originName;

    private String imagePath;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Item item;


}
