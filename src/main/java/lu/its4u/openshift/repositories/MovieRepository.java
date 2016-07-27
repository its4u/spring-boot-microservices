package lu.its4u.openshift.repositories;

import java.util.List;

import lu.its4u.openshift.persistences.entities.Movie;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Movie repository.
 * 
 * @author Jerome CRISTANTE
 *
 */
public interface MovieRepository extends ElasticsearchRepository<Movie, Long> {
	
	public List<Movie> findByName(String name);

	
}