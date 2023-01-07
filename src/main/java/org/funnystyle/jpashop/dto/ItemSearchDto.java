package org.funnystyle.jpashop.dto;

import lombok.Getter;
import lombok.Setter;
import org.funnystyle.jpashop.constant.ItemSellStatus;

@Getter
@Setter
public class ItemSearchDto {

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery = "";

}
