package com.mall.menyou.item.domain;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private int stockquantity; //재고 수량

    @OneToOne
    @JoinColumn(name = "item_image_id")
    private ItemImage itemImage; // 상품이미지

    //TODO 카테고리는 ManyToMany인가?
    private Category category; // 카테고리

    private String description; //상품 설명

}
