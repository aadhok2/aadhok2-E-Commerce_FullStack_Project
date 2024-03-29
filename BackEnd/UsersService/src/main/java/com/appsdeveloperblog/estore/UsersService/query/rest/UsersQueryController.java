/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsdeveloperblog.estore.UsersService.query.rest;
 
import com.appsdeveloper.estore.Core.model.User;
import com.appsdeveloper.estore.Core.query.FetchUserPaymentDetailsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UsersQueryController {

    @Autowired
    QueryGateway queryGateway;

    @GetMapping("/{userId}/payment-details")
    public User getUserPaymentDetails(@PathVariable String userId) {
   
        FetchUserPaymentDetailsQuery query = new FetchUserPaymentDetailsQuery(userId);
 
        return queryGateway.query(query, ResponseTypes.instanceOf(User.class)).join();

    }

}
