package com.programmingtech.inventoryservice.controller;


import com.programmingtech.inventoryservice.dto.InventoryResponse;
import com.programmingtech.inventoryservice.model.Inventory;
import com.programmingtech.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> initStock(@RequestParam List<String> skuCode) {
        return inventoryService.isinStock(skuCode);
    }
}
