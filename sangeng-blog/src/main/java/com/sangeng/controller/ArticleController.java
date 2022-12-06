package com.sangeng.controller;

import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Article;
import com.sangeng.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @GetMapping("/list")
//    public List<Article> test(){
//       return articleService.list();
//    }
//
    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList(){
        //查询热门文章  封装成ResponseResult返回
        ResponseResult result = articleService.hotArticleList();
        return result ;
    }

    //文章
    @GetMapping("/articleList")
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        return articleService.articleList(pageNum,pageSize,categoryId);
    }

//    	要求在文章列表点击阅读全文时能够跳转到文章详情页面，可以让用户阅读文章正文。
//      要求：①要在文章详情中展示其分类名
    @GetMapping("/{id}")
    public ResponseResult getArticleDetail(@PathVariable("id") Long id){
        return articleService.getArticleDetail(id);
}
    //定时更新浏览数
    @PutMapping("/updateViewCount/{id}")
    public ResponseResult updateViewCount(@PathVariable("id") Long id){
        return articleService.updateViewCount(id);
    }
    //获取文章浏览数

}
