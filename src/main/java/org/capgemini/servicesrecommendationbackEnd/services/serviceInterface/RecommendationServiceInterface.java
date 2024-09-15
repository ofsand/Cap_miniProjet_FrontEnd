package org.capgemini.servicesrecommendationbackEnd.services.serviceInterface;

import org.capgemini.servicesrecommendationbackEnd.models.dto.RecommendationDto;
import org.capgemini.servicesrecommendationbackEnd.models.entities.Recommendation;

import java.util.List;

public interface RecommendationServiceInterface {
    List<RecommendationDto> getAllRecommendations();
    RecommendationDto getRecommendation(Long recommendationId);
    List<RecommendationDto> getRecommendationsByServiceTradesperson(Long ServiceTradespersonId);
    RecommendationDto addRecommendationToServiceTradesperson(Long ServiceTradespersonId, Recommendation recommendation);
}
