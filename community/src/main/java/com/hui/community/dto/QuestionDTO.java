package com.hui.community.dto;

import com.hui.community.model.User;
import lombok.Data;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/10
 */
@Data
public class QuestionDTO {
    private Integer id;
    //标题
    private String title;
    //创建时间
    private Long gmtCreate;
    //修改时间
    private Long gmtModified;
    //创建者
    private Integer creator;
    //评论数
    private Integer commentCount;
    //阅读数
    private Integer viewCount;
    //点赞数
    private Integer likeCount;
    //标签
    private String tag;
    //描述
    private String description;

    private User user;



}
