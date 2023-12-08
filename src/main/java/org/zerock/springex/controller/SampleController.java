package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.springex.dto.TodoDTO;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/ex1")
    public void ex1(String name,int age){
        log.info("ex1.............");
        log.info("name : " + name);
        log.info("age : " + age);
    }


//  @RequestParam은 defaultValue라는 속성이 있어 '기본값'을 지정할 수 있다. 간혹 파라미터가 전달되지 않을 때를 대비
    @GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name",defaultValue = "AAA") String name,
                    @RequestParam(name = "age",defaultValue = "20") int age){
        log.info("ex2...................");
        log.info("name : " + name);
        log.info("age : " + age);
    }


    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate){
        log.info("ex3..............");
        log.info("dueDate : " + dueDate);
    }


    @GetMapping("/ex4")
    public void ex4(Model model){

        log.info("---------------------------");

        model.addAttribute("message","Hello World!!!");

    }

    //파라미터가 getter/setter 를 이용하는 Beans의 형식의 사용자 정의 클래스인 경우 자동으로 화면에 객체를 전달
//    @GetMapping("/ex4_1")
//    public void ex4Extra(TodoDTO todoDTO, Model model){
//
//        log.info(todoDTO);
//
//    }

    @GetMapping("/ex4_1")
    public void ex4Extra(@ModelAttribute("dto") TodoDTO todoDTO, Model model){

        log.info(todoDTO);

    }


    //RedirectAttributes(스프링 MVC의 PRG 패턴)
    //addAttribute : 리다이렉트 할 때 쿼리 스트링이 되는 값을 지정
    //addFlashAttribute : 일회용으로만 데이터를 전달하고 삭제되는 값을 지정
    @GetMapping("/ex5")
    public String ex5(RedirectAttributes redirectAttributes){

        redirectAttributes.addAttribute("name","ABC");
        redirectAttributes.addFlashAttribute("result","success");

        return "redirect:/ex6";
    }

    @GetMapping("/ex6")
    public void ex6(){

    }

    @GetMapping("/ex7")
    public void ex7(String p1, int p2){
        log.info("p1.............." + p1);
        log.info("p2.............." + p2);
    }






}
