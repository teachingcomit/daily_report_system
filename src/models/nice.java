package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table (name = "nice")
@NamedQueries({
    @NamedQuery(
            name = "getAllNice",
            query = "SELECT n FROM nice AS n ORDER BY n.id DESC"
            ),
    @NamedQuery(
            name = "getNiceCount",
            query = "SELECT COUNT(n) FROM nice AS n where "
            ),

})

@Entity
public class nice{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name ="report_id", nullable = false)
    private Report report;




    }
