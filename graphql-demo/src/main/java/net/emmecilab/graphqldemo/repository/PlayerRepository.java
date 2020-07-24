package net.emmecilab.graphqldemo.repository;

import net.emmecilab.graphqldemo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mauro Cicolella
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
