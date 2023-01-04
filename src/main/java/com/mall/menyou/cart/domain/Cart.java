package com.mall.menyou.cart.domain;

import com.mall.menyou.item.domain.Item;
import com.mall.menyou.member.domain.Member;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Cart{

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch =FetchType.LAZY )
    @JoinColumn(name = "item_id")
    private Item item;

    private int count;

}
