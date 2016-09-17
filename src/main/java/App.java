import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get ("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/word.vtl");
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word.getWord());
      model.put("definitions", word.getDefinitions());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) ->  {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.all());
      model.put("template", "templates/index.vtl");
      String newWordInput = request.queryParams("newWordInput");
      Word word = new Word(newWordInput);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/:id", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/word.vtl");
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      String wordDefinitionInput = request.queryParams("wordDefinitionInput");
      Definition wordDefinition = new Definition(wordDefinitionInput);
      word.defineWord(wordDefinition);
      model.put("word", word.getWord());
      model.put("definitions", word.getDefinitions());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
