package com.hui.community.service;

import com.hui.community.dto.PaginationDTO;
import com.hui.community.dto.QuestionDTO;
import com.hui.community.model.Question;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/10
 */
public interface QuestionService {
    /**
     * 查询问题列表,并且带有发起人的头像.
     * @return
     */
     //List<QuestionDTO> questionDTOList();

    PaginationDTO list(Integer page, Integer size);

    PaginationDTO list(Integer userId, Integer page, Integer size);

    QuestionDTO getById(Integer id);

    void createOrUpdate(Question question);
}
