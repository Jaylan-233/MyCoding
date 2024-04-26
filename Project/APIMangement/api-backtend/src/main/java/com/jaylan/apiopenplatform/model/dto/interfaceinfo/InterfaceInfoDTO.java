package com.jaylan.apiopenplatform.model.dto.interfaceinfo;

import com.jaylan.apiopenplatform.model.entity.Post;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * 接口信息 ES 包装类
 **/
// todo 取消注释开启 ES（须先配置 ES）
//@Document(indexName = "post")
@Data
public class InterfaceInfoDTO implements Serializable {

    private static final String DATE_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /**
     * id
     */
    @Id
    private Long id;


    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态 0-关闭 1-开启
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;


    /**
     * 创建时间
     */
    @Field(index = false, store = true, type = FieldType.Date, format = {}, pattern = DATE_TIME_PATTERN)
    private Date createTime;

    /**
     * 更新时间
     */
    @Field(index = false, store = true, type = FieldType.Date, format = {}, pattern = DATE_TIME_PATTERN)
    private Date updateTime;

    /**
     * 是否删除
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;

    /**
     * 对象转包装类
     * TODO:待确认
     *
     * @param post
     * @return postEsDTO
     */
    public static InterfaceInfoDTO objToDto(Post post) {
        if (post == null) {
            return null;
        }
        InterfaceInfoDTO postEsDTO = new InterfaceInfoDTO();
        BeanUtils.copyProperties(post, postEsDTO);
        return postEsDTO;
    }

    /**
     * @param postEsDTO
     * @return Post
     */
    public static Post dtoToObj(InterfaceInfoDTO postEsDTO) {
        if (postEsDTO == null) {
            return null;
        }
        Post post = new Post();
        BeanUtils.copyProperties(postEsDTO, post);
        return post;
    }
}
