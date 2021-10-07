package net.emmecilab.players.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.emmecilab.players.model.Player;

/**
 *
 * @author Mauro Cicolella
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
