package Entity;

import Model.StatusPayment;

import javax.persistence.*;

@Entity(name = "order_table")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "customer_id")
    private long costumerId;

    @Enumerated(EnumType.STRING)
    private StatusPayment statusPayment;

}
