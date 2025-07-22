package com.devsb.tasks.mappers;

import com.devsb.tasks.domain.dto.TaskListDto;
import com.devsb.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
