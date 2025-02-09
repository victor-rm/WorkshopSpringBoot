package com.victru.crud.entities.enums;

public enum OrderStatus {
    /*  Para evitar que os códigos no banco de dados mudem após a adição de uma nova opção no enum, força-se
        o uso de um código específico associado a uma variável do Enum. Melhorando a manutenabilidade.
    */
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid order status code");
    }
}
