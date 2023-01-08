package org.funnystyle.jpashop.repository;

import org.funnystyle.jpashop.dto.ItemSearchDto;
import org.funnystyle.jpashop.dto.MainItemDto;
import org.funnystyle.jpashop.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}
