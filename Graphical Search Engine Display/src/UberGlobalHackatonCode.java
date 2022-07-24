/**
 *
 * @authors Chloe Larsen, Rene Kruger and Kayla Bayers
 * All of the summaries in this code are taken from the website "https://smmry.com/" as we did not have enough time to code a summarizer.
 */


import javax.swing.*;
import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class UberGlobalHackatonCode {
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static void main(String args[]) throws IOException {
        String website1 = "", website2 = "" ,website3 = "", website4 = "", website5 = "", positiveWebsites = "", negativeWebsites = "", neutralWebsites = "", positiveSum = "", neutralSum = "",negativeSum = "", generalSum = "";
        Connection conn1, conn2, conn3, conn4, conn5;
        Document doc1, doc2, doc3, doc4, doc5;
        
        
        
        JOptionPane.showMessageDialog(null,"Welcome to the Graphical Search Engine Display!!\n"
                + "These are the three topics you can choose from:\n"
                + "Topic 1:\n"
                + "Abortion Rights\n"
                + "Topic 2:\n"
                + "Animal Rights\n"
                + "Topic 3:\n"
                + "Transgender Rights");
        char topicNum = JOptionPane.showInputDialog("Please enter what topic you would like to read about(just enter the topic number):").charAt(0);
        
        switch(topicNum){
            case '1': //Abortion Rights
//{
                website1 = "https://www.scientificamerican.com/article/abortion-rights-are-good-health-and-good-science/";
                conn1 = Jsoup.connect(website1);
                doc1 = conn1.get();
                String website1Text = doc1.body().text();//website 1 text
                
                if(website1Text.contains("Pro-choice")&& website1Text.contains("Pro-life")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("pro-choice") && website1Text.contains("pro-life")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("science") && website1Text.contains("murder")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("pregnancy rights") && website1Text.contains("illegal")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("democrats") && website1Text.contains("republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("Democrats") && website1Text.contains("Republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }
                else if(website1Text.contains("Pro-life")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("pro-life")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("murder")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("illegal")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("Republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }
                else if(website1Text.contains("Pro-choice")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("pro-choice")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("science")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("pregnancy rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("Democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }
            
//} end of website 1
                
//{
                website2 = "https://abortion.procon.org/";
                conn2 = Jsoup.connect(website2);
                doc2 = conn2.get();
                String website2Text = doc2.body().text();//website 2 text
                if(website2Text.contains("Pro-choice")&& website2Text.contains("Pro-life")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("pro-choice") && website2Text.contains("pro-life")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("science") && website2Text.contains("murder")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("pregnancy rights") && website2Text.contains("illegal")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("democrats") && website2Text.contains("republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website1Text.contains("Democrats") && website1Text.contains("Republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }
                else if(website2Text.contains("Pro-life")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("pro-life")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("murder")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("illegal")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("Republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }
                else if(website2Text.contains("Pro-choice")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("pro-choice")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("science")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("pregnancy rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("Democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }
//} end of website 2
                
//{
                website3 = "https://www.nytimes.com/2022/07/03/us/pro-life-young-women-roe-abortion.html";
                conn3 = Jsoup.connect(website3);
                doc3 = conn3.get();
                String website3Text = doc3.body().text();//website 3 text
                
                
                if(website3Text.contains("Pro-choice")&& website3Text.contains("Pro-life")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("pro-choice") && website3Text.contains("pro-life")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("science") && website3Text.contains("murder")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("pregnancy rights") && website3Text.contains("illegal")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("democrats") && website3Text.contains("republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("Democrats") && website3Text.contains("Republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }
                else if(website3Text.contains("Pro-life")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("pro-life")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("murder")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("illegal")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("Republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }
                else if(website3Text.contains("Pro-choice")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("pro-choice")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("science")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("pregnancy rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("Democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }
//} end of website 3
                
//{
                website4 = "https://www.oah.org/tah/issues/2016/november/abolishing-abortion-the-history-of-the-pro-life-movement-in-america/";
                conn4 = Jsoup.connect(website4);
                doc4 = conn4.get();
                String website4Text = doc4.body().text();//website 4 text
                
                
                if(website4Text.contains("Pro-choice")&& website4Text.contains("Pro-life")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("pro-choice") && website4Text.contains("pro-life")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("science") && website4Text.contains("murder")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("pregnancy rights") && website4Text.contains("illegal")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("democrats") && website4Text.contains("republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("Democrats") && website4Text.contains("Republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }
                else if(website4Text.contains("Pro-life")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("pro-life")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("murder")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("illegal")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("Republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }
                else if(website4Text.contains("Pro-choice")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("pro-choice")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("science")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("pregnancy rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("Democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }
//} end of website 4
                
//{
                website5 = "https://www.bbc.co.uk/ethics/abortion/mother/for_1.shtml";
                conn5 = Jsoup.connect(website5);
                doc5 = conn5.get();
                String website5Text = doc5.body().text();//website 5 text
                
                if(website5Text.contains("Pro-choice")&& website5Text.contains("Pro-life")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("pro-choice") && website5Text.contains("pro-life")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("science") && website5Text.contains("murder")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("pregnancy rights") && website5Text.contains("illegal")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("democrats") && website5Text.contains("republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("Democrats") && website5Text.contains("Republican")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }
                else if(website5Text.contains("Pro-life")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("pro-life")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("murder")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("illegal")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("Republican")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }
                else if(website5Text.contains("Pro-choice")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("pro-choice")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("science")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("pregnancy rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("Democrats")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }
//} end of website 5   
                generalSum ="According to the World Health Organization, \"Evidence shows that restricting access to abortions does not reduce the number of abortions; however, it does affect whether the abortions\n"
                        + "that women and girls attain are safe and dignified. The proportion of unsafe abortions are significantly higher in countries with highly restrictive abortion laws than in countries \n"
                        + "with less restrictive laws.\" Pro 2 Abortion bans endangers healthcare for those not seeking abortions. Women's rights arguments in favour of abortion Here are some of the women's rights \n"
                        + "arguments in favour of abortion: women have a moral right to decide what to do with their bodies the right to abortion is vital for gender equality the right to abortion is vital for \n"
                        + "individual women to achieve their full potential banning abortion puts women at risk by forcing them to use illegal abortionists the right to abortion should be part of a portfolio of \n"
                        + "pregnancy rights that enables women to make a truly free choice whether to end a pregnancy. This argument reminds us that even in the abortion debate, we should regard the woman as a \n"
                        + "person and not just as a container for the foetus.";
                positiveSum = TEXT_BLUE + "The fight against abortion rights is often depicted as a religious mission, but not all religions or religious believers oppose abortion.";
                neutralSum = TEXT_PURPLE + "According to the World Health Organization, \"Evidence shows that restricting access to abortions does not reduce the number of abortions; however, it does affect whether the abortions \n"
                        + TEXT_PURPLE + "that women and girls attain are safe and dignified. The proportion of unsafe abortions are significantly higher in countries with highly restrictive abortion laws than in countries with \n"
                        + TEXT_PURPLE + "less restrictive laws.\" Pro 2 Abortion bans endangers healthcare for those not seeking abortions.";
                negativeSum = TEXT_YELLOW + "For the majority of American women who support abortion rights, other women's enthusiasm for stripping away their own constitutional rights can be baffling and enraging, a profound betrayal.";
            break;
            
            case '2': //Animal Rights
                //{
                website1 = "https://www.sciencedirect.com/topics/social-sciences/animal-rights";
                conn1 = Jsoup.connect(website1);
                doc1 = conn1.get();
                website1Text = doc1.body().text();//website 1 text  
                
                if(website1Text.contains("Animal rights")&& website1Text.contains("hunted")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("animal rights") && website1Text.contains("abuse")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("freedom") && website1Text.contains("caged")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("protection") && website1Text.contains("zoo")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("free") && website1Text.contains("canned")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("fair") && website1Text.contains("trade")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }
                else if(website1Text.contains("hunted")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("abuse")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("caged")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("zoo")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("canned")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("trade")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }
                else if(website1Text.contains("Animal rights")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("animal rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("freedom")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("protection")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("free")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("fair")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }
            
//} end of website 1 c2
                
//{
                website2 = "https://www.milliondollarvegan.com/animal-rights/";
                conn2 = Jsoup.connect(website2);
                doc2 = conn2.get();
                website2Text = doc2.body().text();//website 2 text
                
                if(website2Text.contains("Animal-rights")&& website2Text.contains("hunted")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("animal-rights") && website2Text.contains("abuse")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("freedom") && website2Text.contains("caged")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("protection") && website2Text.contains("zoo")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("free") && website2Text.contains("canned")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website1Text.contains("fair") && website1Text.contains("trade")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }
                else if(website2Text.contains("hunted")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("abuse")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("caged")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("zoo")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("canned")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("trade")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }
                else if(website2Text.contains("Animal-rights")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("animal-rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("freedom")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("protection")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("free")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("fair")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }
//} end of website 2 c2
                
//{
                website3 = "http://www.humanedecisions.com/effective-ways-to-advocate-for-animals/";
                conn3 = Jsoup.connect(website3);
                doc3 = conn3.get();
                website3Text = doc3.body().text();//website 3 text
                
                if(website3Text.contains("Animal-rights")&& website3Text.contains("hunted")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("animal-rights") && website3Text.contains("abuse")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("freedom") && website3Text.contains("caged")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("protection") && website3Text.contains("zoo")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("free") && website3Text.contains("canned")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("fair") && website3Text.contains("trade")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }
                else if(website3Text.contains("hunted")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("abuse")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("caged")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("zoo")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("canned")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("trade")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }
                else if(website3Text.contains("Animal-rights")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("animal-rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("freedom")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("protection")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("free")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("fair")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }
//} end of website 3 c2
                
//{
                website4 = "https://www.britannica.com/topic/animal-rights/The-modern-animal-rights-movement";
                conn4 = Jsoup.connect(website4);
                doc4 = conn4.get();
                website4Text = doc4.body().text();//website 4 text
                
                if(website4Text.contains("Animal-rights")&& website4Text.contains("hunted")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("animal-rights") && website4Text.contains("abuse")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("freedom") && website4Text.contains("caged")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("protection") && website4Text.contains("zoo")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("free") && website4Text.contains("canned")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("fair") && website4Text.contains("trade")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }
                else if(website4Text.contains("hunted")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("abuse")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("caged")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("zoo")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("canned")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("trade")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }
                else if(website4Text.contains("Animal-rights")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("animal-rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("freedom")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("protection")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("free")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("fair")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }
//} end of website 4 
                
//{
                website5 = "https://faunalytics.org/the-animal-rights-movement-history-and-facts-about-animal-rights/";
                conn5 = Jsoup.connect(website5);
                doc5 = conn5.get();
                website5Text = doc5.body().text();//website 5 text
                
                if(website5Text.contains("Animal-rights")&& website5Text.contains("hunted")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("animal-rights") && website5Text.contains("abuse")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("freedom") && website5Text.contains("caged")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("protection") && website5Text.contains("zoo")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("free") && website5Text.contains("canned")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("fair") && website5Text.contains("trade")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }
                else if(website5Text.contains("hunted")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("abuse")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("caged")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("zoo")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("canned")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("fair")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }
                else if(website5Text.contains("Animal-rights")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("animal-rights")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("freedom")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("protection")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("free")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("fair")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }
                //} end of website 5 c2
                generalSum = "First you want to consider what types of animals you want to help-pets or companion animals, farm animals and factory farming, wild animals, animals used in medical and scientific \n"
                        + "research, animals used for entertainment-or maybe you want to address all the areas where animals are exploited and mistreated.";
                positiveSum = TEXT_BLUE + "None of the websites ranked positivily";
                neutralSum = TEXT_PURPLE + "Environmental rights extremist groups, such as the Earth Liberation front and The Family are concerned with protecting the entire ecosystem, while animal rights extremist group such \n"
                        + TEXT_PURPLE +  "as the Animal Liberation front, are more narrowly focused on ensuring equality of animals.";
                negativeSum = TEXT_YELLOW + "First you want to consider what types of animals you want to help-pets or companion animals, farm animals and factory farming, wild animals, animals used in medical and scientific \n"
                        + TEXT_YELLOW + "research, animals used for entertainment-or maybe you want to address all the areas where animals are exploited and mistreated.";
            break;
            
            case '3': //Transgender Rights
                //{
                website1 = "https://www.aclu.org/issues/lgbtq-rights/transgender-rights";
                conn1 = Jsoup.connect(website1);
                doc1 = conn1.get();
                website1Text = doc1.body().text();//website 1 text  
                
                if(website1Text.contains("nonconforming")&& website1Text.contains("discrimination")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("Nonconforming") && website1Text.contains("Discrimination")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("transistion") && website1Text.contains("attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("Transistion") && website1Text.contains("Attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("medical") && website1Text.contains("detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }else if(website1Text.contains("Medical") && website1Text.contains("Detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website1 + "\n");
                }
                else if(website1Text.contains("discrimination")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("Discrimination")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("Attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }else if(website1Text.contains("Detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website1 + "\n");
                }
                else if(website1Text.contains("nonconforming")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("Nonconforming")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("Transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }else if(website1Text.contains("Medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website1 + "\n");
                }
            
//} end of website 1
                
//{
                website2 = "https://www.hrc.org/resources/understanding-the-transgender-community";
                conn2 = Jsoup.connect(website2);
                doc2 = conn2.get();
                website2Text = doc2.body().text();//website 2 text
                
                if(website2Text.contains("nonconforming")&& website2Text.contains("discrimination")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("Nonconforming") && website2Text.contains("discrimination")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("transistion") && website2Text.contains("attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("Transistion") && website2Text.contains("Attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website2Text.contains("medical") && website2Text.contains("detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }else if(website1Text.contains("Medical") && website1Text.contains("Detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website2 + "\n");
                }
                else if(website2Text.contains("discrimination")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("Discrimination")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("Attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }else if(website2Text.contains("Detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website2 + "\n");
                }
                else if(website2Text.contains("nonconforming")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("Nonconforming")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("Transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }else if(website2Text.contains("Medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website2 + "\n");
                }
//} end of website 2
                
//{
                website3 = "https://library.law.howard.edu/civilrightshistory/transgender";
                conn3 = Jsoup.connect(website3);
                doc3 = conn3.get();
                website3Text = doc3.body().text();//website 3 text
                
                if(website3Text.contains("nonconforming")&& website3Text.contains("discrimination")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("Nonconforming") && website3Text.contains("Discrimination")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("transistion") && website3Text.contains("attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("Transistion") && website3Text.contains("Attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("medical") && website3Text.contains("detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }else if(website3Text.contains("Medical") && website3Text.contains("Detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website3 + "\n");
                }
                else if(website3Text.contains("discrimination")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("Discrimination")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("Attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }else if(website3Text.contains("Detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website3 + "\n");
                }
                else if(website3Text.contains("nonconforming")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("Nonconforming")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("Transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }else if(website3Text.contains("Medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website3 + "\n");
                }
//} end of website 3
                
//{
                website4 = "https://www.queerevents.ca/education/transgender/trans-rights#:~:text=Trans%20Rights%20are%20Human%20Rights.%20When%20we%20talk,level%20of%20respect%20and%20decency%20as%20cis-gender%20individuals.";
                conn4 = Jsoup.connect(website4);
                doc4 = conn4.get();
                website4Text = doc4.body().text();//website 4 text
                
                if(website4Text.contains("nonconforming")&& website4Text.contains("discrimination")){//ranking neutrally
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("Nonconforming") && website4Text.contains("Discrimination")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("transistion") && website4Text.contains("attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("Transistion") && website4Text.contains("Attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("medical") && website4Text.contains("detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }else if(website4Text.contains("Medical") && website4Text.contains("Detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website4 + "\n");
                }
                else if(website4Text.contains("discrimination")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("Discrimination")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("Attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }else if(website4Text.contains("Detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website4 + "\n");
                }
                else if(website4Text.contains("nonconforming")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("Nonconforming")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("Transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }else if(website4Text.contains("Medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website4 + "\n");
                }
//} end of website 4
                
//{
                website5 = "https://simmalieberman.com/why-lgbt-people-dont-need-special-rights/";
                conn5 = Jsoup.connect(website5);
                doc5 = conn5.get();
                website5Text = doc5.body().text();//website 5 text
                
                if(website5Text.contains("nonconforming")&& website5Text.contains("discrimination")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("Nonconforming") && website5Text.contains("Discrimination")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("transistion") && website5Text.contains("attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("Transistion") && website5Text.contains("Attacked")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("medical") && website5Text.contains("detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE + website5 + "\n");
                }else if(website5Text.contains("Medical") && website5Text.contains("Detention facilities")){
                    neutralWebsites = neutralWebsites.concat(TEXT_PURPLE+ website5 + "\n");
                }
                else if(website5Text.contains("discrimination")){//ranking negitivly
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("Discrimination")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("Attacked")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }else if(website5Text.contains("Detention facilities")){
                    negativeWebsites = negativeWebsites.concat(TEXT_YELLOW + website5 + "\n");
                }
                else if(website5Text.contains("nonconforming")){//ranking positivly
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("Nonconforming")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("Transistion")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }else if(website5Text.contains("Medical")){
                    positiveWebsites = positiveWebsites.concat(TEXT_BLUE + website5 + "\n");
                }
                //} end of website 5
                generalSum = "Simmma Reply Beverly Guinevere Taff July 6, 2016 at 2:38 am LGBT people DONT need 'special rights' they simply need the Same rights as anybody else and that those rights be RIGIDLY \n"
                        + "enforced and protected by the courts in EVERY country.";
                positiveSum = TEXT_BLUE + "None of the websites ranked positivily";
                neutralSum = TEXT_PURPLE + "The ACLU champions transgender people's right to be themselves.";
                negativeSum = TEXT_YELLOW + "What are Trans Rights? Trans prople have been around for hunderds of years and we're not about to stop existing now! Trans rights are human rights. When we talk about trans rights we \n"
                        + TEXT_YELLOW + "mean the right to exist without fear of harassment, violence and discrimination simply because we are transgender.";
            break;
            default:
            JOptionPane.showMessageDialog(null,"You have entered something incorrectly, please restart the program.");
            System.exit(0);
        }
        System.out.print("General Summary: \n" + generalSum);
        System.out.print("\n\n"+TEXT_BLUE+"Positive: \n" +positiveSum +"\n"+TEXT_BLUE+"Websites:\n"+ TEXT_BLUE + positiveWebsites);
        System.out.print("\n\n"+TEXT_PURPLE+"Neutral: \n" + neutralSum +"\n"+TEXT_PURPLE+"Websites:\n"+ TEXT_PURPLE + neutralWebsites);
        System.out.print("\n\n"+TEXT_YELLOW+"Negative: \n" +negativeSum +"\n"+TEXT_YELLOW+"Websites\n"+TEXT_YELLOW + negativeWebsites);
        }    
}