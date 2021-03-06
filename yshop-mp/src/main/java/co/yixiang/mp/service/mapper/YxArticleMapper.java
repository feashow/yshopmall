package co.yixiang.mp.service.mapper;

import co.yixiang.mapper.EntityMapper;

import co.yixiang.mp.domain.YxArticle;
import co.yixiang.mp.service.dto.YxArticleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author hupeng
* @date 2019-10-07
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YxArticleMapper extends EntityMapper<YxArticleDTO, YxArticle> {

}