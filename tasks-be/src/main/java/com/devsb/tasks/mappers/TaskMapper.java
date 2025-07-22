package com.devsb.tasks.mappers;

import com.devsb.tasks.domain.dto.TaskDto;
import com.devsb.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
