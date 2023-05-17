package com.programmingtech.inventoryservice.controller;


import com.programmingtech.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("sku-code")
    @ResponseStatus(HttpStatus.OK)
    public boolean initStock(@PathVariable("sku-code") String skuCode ) {
        return inventoryService.isinStock(skuCode);
    }
}
