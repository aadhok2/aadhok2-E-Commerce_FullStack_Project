package com.appsdeveloper.estore.OrdersService.command.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
public class ApproveOrderCommand {

    @TargetAggregateIdentifier
    private final String orderId;
    private final String productId;
}
