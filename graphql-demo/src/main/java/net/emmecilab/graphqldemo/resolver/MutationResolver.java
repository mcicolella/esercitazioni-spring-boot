package net.emmecilab.graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import java.util.Optional;
import net.emmecilab.graphqldemo.model.Player;
import net.emmecilab.graphqldemo.repository.PlayerRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mauro Cicolella
 */
@Component
public class MutationResolver implements GraphQLMutationResolver {

    private PlayerRepository playerRepository;

    public MutationResolver(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player newPlayer(String firstName, String lastName, String team, String position) {
        Player player = new Player();
        player.setFirstName(firstName);
        player.setLastName(lastName);
        player.setTeam(team);
        player.setPosition(position);

        playerRepository.save(player);

        return player;
    }

    public Optional<Player> updatePlayer(Long id, String firstName, String lastName, String team, String position) {

        Optional<Player> player = playerRepository.findById(id);

        player.ifPresent(p -> {
            p.setFirstName(firstName);
            p.setLastName(lastName);
            p.setTeam(team);
            p.setPosition(position);

            playerRepository.save(p);
        });

        return player;
    }

    public boolean deletePlayer(Long id) {
        playerRepository.deleteById(id);
        return true;
    }

}
