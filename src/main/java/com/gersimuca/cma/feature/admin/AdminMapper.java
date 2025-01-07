package com.gersimuca.cma.feature.admin;

import com.gersimuca.cma.common.MapperConfig;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface AdminMapper {
  AdminDto mapToDto(AdminEntity admin);

  AdminResponse mapToResponse(AdminDto dto);
}