package com.hui.community.controller;

import com.hui.community.dto.QuestionDTO;
import com.hui.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/12
 */
@Controller
public class QuestionController {

        @Autowired
        private QuestionService questionServiceImpl;

        @GetMapping("/question/{id}")
        public String question(@PathVariable(name = "id") Integer id,
                               Model model) {
            QuestionDTO questionDTO = questionServiceImpl.getById(id);
            model.addAttribute("question", questionDTO);
            return "question";
        }

}
