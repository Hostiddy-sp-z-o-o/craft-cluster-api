package pl.pomoku.craftclusterapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(nullable = false)
    public String name;

    @Column(name = "ip_address", nullable = false)
    public String ipAddress;

    @Column(nullable = false)
    @Min(1024)
    @Max(49151)
    public int port;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
