package com.project.designpatterns.service;

import com.project.designpatterns.dao.OrderDAO;
import com.project.designpatterns.objectMappers.OrderMapper;
import com.project.designpatterns.pojos.OrderRequest;
import org.springframework.stereotype.Service;


@Service("REGULAR")
public class RegularOrderServiceImpl implements OrderService {

    private final OrderDAO orderDAO;

    public RegularOrderServiceImpl(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    public Long processOrder(OrderRequest order) {
        try {
            return orderDAO.saveOrder(OrderMapper.convertToOrderEntity(order)).getId();
        } catch (Exception e) {
            return (long) -1;
        }
    }

    @Override
    public String getType(String type) {
        return "REGULAR";
    }
}
