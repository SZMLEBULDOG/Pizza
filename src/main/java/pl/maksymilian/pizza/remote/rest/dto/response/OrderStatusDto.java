package pl.maksymilian.pizza.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.maksymilian.pizza.domain.model.OrderStatusType;

import java.util.Date;

public class OrderStatusDto {

    private OrderStatusType status;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAT;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    public OrderStatusDto() {
    }

    public OrderStatusDto(OrderStatusType status, Date createdAT, Date expectedAt, Date updatedAt) {
        this.status = status;
        this.createdAT = createdAT;
        this.expectedAt = expectedAt;
        this.updatedAt = updatedAt;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public Date getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(Date createdAT) {
        this.createdAT = createdAT;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}