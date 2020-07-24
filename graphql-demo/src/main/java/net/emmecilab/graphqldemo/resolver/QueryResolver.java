package net.emmecilab.graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import java.util.Optional;
import net.emmecilab.graphqldemo.model.Player;
import net.emmecilab.graphqldemo.repository.PlayerRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mauro Cicolella
 */
@Component
public class QueryResolver implements GraphQLResolver {
 
    private PlayerRepository playerRepository;
    
    public QueryResolver(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
            
    public Optional<Player> player(Long id) {
        return playerRepository.findById(id);
    }
 
    public Iterable<Player> findAllArticles() {
        return playerRepository.findAll();
    }
 
}
