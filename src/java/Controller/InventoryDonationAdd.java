/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DonationEntryDAO;
import DAO.MailDAO;
import Model.ItemInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mradul
 */
public class InventoryDonationAdd extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 
     * THIS SERVLET IS ACCESSED FROM INVENTORYDONATION.JSP AND IN THIS SERVLET WE WILL SET ALL ITEM DETAILS AND WILL FORWARD IT TO DONATION ENTRY DAO.
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InventoryDonationAdd</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InventoryDonationAdd at " + request.getContextPath() + "</h1>");
            HttpSession session=request.getSession(false);
            if(session.getAttribute("Email")==null || !session.getAttribute("etype").equals("Donor"))
            {
                response.sendRedirect("login.html");
            }
            
            
            String Email=session.getAttribute("Email").toString();
            
            
            
            List<ItemInfo>Item=new ArrayList<ItemInfo>();
            DonationEntryDAO Id=new DonationEntryDAO();
            try
            {
                String Pencil=request.getParameter("Pencil");
                String Drawing=request.getParameter("Drawing");
                String Copy=request.getParameter("Copy");
                String Color=request.getParameter("Color");
                String Pen=request.getParameter("Pen");
                String Scale=request.getParameter("Scale");
                String Erasers=request.getParameter("Erasers");
                String Sharpners=request.getParameter("Sharpners");
                String Board=request.getParameter("Board");
                String Chalk=request.getParameter("Chalk");
                String Duster=request.getParameter("Duster");
                String StudyTable=request.getParameter("StudyTable");
                
                System.out.println("Drawing "+ Drawing);
                System.out.println("Copy "+ Copy);
                System.out.println("Color "+ Color);
                System.out.println("Pen "+Pen);
                System.out.println("Scale "+ Scale);
                System.out.println("Eraser "+ Erasers);
                System.out.println("Sharpners "+ Sharpners);
                System.out.println("Board "+ Board);
                System.out.println("Chalk "+ Chalk);
                System.out.println("Duster "+ Duster);
                System.out.println("StudyTable "+ StudyTable);
                
                if(Pencil!=null && Pencil.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String PencilType=request.getParameter("penciltype");
                 
                    int pencilQty=Integer.parseInt(request.getParameter("PencilQTY"));
                    
                    temp.setItemName("Pencil");
                    temp.setItemType(PencilType);
                    temp.setQuantity(pencilQty);
                    
                    Item.add(temp);
                    
                    System.out.println("Pencil"+"Type: "+PencilType+" Quantity: "+pencilQty);
                }
                
                if(Drawing!=null && Drawing.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String DrawingType=request.getParameter("drawingtype");
                 
                    int DrawingQty=Integer.parseInt(request.getParameter("DrawingQTY"));
                    
                    temp.setItemName("Drawing");
                    temp.setItemType(DrawingType);
                    temp.setQuantity(DrawingQty);
                    
                    Item.add(temp);
                    
                  
                    System.out.println("Drawing"+"Type: "+DrawingType+" Quantity: "+DrawingQty);
                }
                
                if(Copy!=null && Copy.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String CopyType=request.getParameter("copytype");
                 
                    int CopyQty=Integer.parseInt(request.getParameter("CopyQTY"));
                    
                    temp.setItemName("Copy");
                    temp.setItemType(CopyType);
                    temp.setQuantity(CopyQty);
                    
                    Item.add(temp);
                    
                  
                    System.out.println("Copy"+"Type: "+CopyType+" Quantity: "+CopyQty);
                }
                
                
                if(Color!=null && Color.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String ColorType=request.getParameter("colortype");
                 
                    int ColorQty=Integer.parseInt(request.getParameter("ColorQTY"));
                    
                    temp.setItemName("Colour");
                    temp.setItemType(ColorType);
                    temp.setQuantity(ColorQty);
                    
                    Item.add(temp);
                    
                    
                    System.out.println("Color"+"Type: "+ColorType+" Quantity: "+ColorQty);
                }
                
                if(Pen!=null && Pen.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String PenType=request.getParameter("pentype");
                 
                    int PenQty=Integer.parseInt(request.getParameter("PenQTY"));
                    
                    temp.setItemName("Pen");
                    temp.setItemType(PenType);
                    temp.setQuantity(PenQty);
                    
                    Item.add(temp);
                    
      
                    System.out.println("Pen"+"Type: "+PenType+" Quantity: "+PenQty);
                }
                
                if(Scale!=null && Scale.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String ScaleType=request.getParameter("scaletype");
                 
                    int ScaleQty=Integer.parseInt(request.getParameter("ScaleQTY"));
                    
                    temp.setItemName("Scale");
                    temp.setItemType(ScaleType);
                    temp.setQuantity(ScaleQty);
                    
                    Item.add(temp);
                    
                    
                    System.out.println("Scale"+"Type: "+ScaleType+" Quantity: "+ScaleQty);
                }
                
                if(Erasers!=null && Erasers.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String ErasersType=request.getParameter("erasertype");
                 
                    int ErasersQty=Integer.parseInt(request.getParameter("EraserQTY"));
                    
                    temp.setItemName("Eraser");
                    temp.setItemType(ErasersType);
                    temp.setQuantity(ErasersQty);
                    
                    Item.add(temp);
                    
                    
                    System.out.println("Eraser"+"Type: "+ErasersType+" Quantity: "+ErasersQty);
                }
                
                if(Sharpners!=null && Sharpners.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String SharpnersType=request.getParameter("sharpenertype");
                 
                    int SharpnersQty=Integer.parseInt(request.getParameter("SharpenerQTY"));
                    
                    temp.setItemName("Sharpner");
                    temp.setItemType(SharpnersType);
                    temp.setQuantity(SharpnersQty);
                    
                    Item.add(temp);
                    
                    
                    System.out.println("Sharpner"+"Type: "+SharpnersType+" Quantity: "+SharpnersQty);
                }
                
                if(Board!=null && Board.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String BoardType=request.getParameter("boardtype");
                 
                    int BoardQty=Integer.parseInt(request.getParameter("BoardQTY"));
                    
                    temp.setItemName("Board");
                    temp.setItemType(BoardType);
                    temp.setQuantity(BoardQty);
                    
                    Item.add(temp);
                    
                    
                    System.out.println("Board"+"Type: "+BoardType+" Quantity: "+BoardQty);
                }
                
                if(Chalk!=null && Chalk.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String ChalkType=request.getParameter("chalktype");
                 
                    int ChalkQty=Integer.parseInt(request.getParameter("ChalkQTY"));
                    
                    temp.setItemName("Chalk");
                    temp.setItemType(ChalkType);
                    temp.setQuantity(ChalkQty);
                    
                    Item.add(temp);
                    
                    
                    System.out.println("Chalk"+"Type: "+ChalkType+" Quantity: "+ChalkQty);
                }
                
                
                if(Duster!=null && Duster.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String DusterType=request.getParameter("dustertype");
                 
                    int DusterQty=Integer.parseInt(request.getParameter("DusterQTY"));
                    
                    temp.setItemName("Duster");
                    temp.setItemType(DusterType);
                    temp.setQuantity(DusterQty);
                    
                    Item.add(temp);
                    
                    
                    System.out.println("Duster"+"Type: "+DusterType+" Quantity: "+DusterQty);
                }
                
                
                if(StudyTable!=null && StudyTable.equals("on"))
                {
                    ItemInfo temp=new ItemInfo();
                    String StudyTableType=request.getParameter("studytabletype");
                 
                    int StudyTableQty=Integer.parseInt(request.getParameter("StudyTableQTY"));
                    
                    temp.setItemName("StudyTable");
                    temp.setItemType(StudyTableType);
                    temp.setQuantity(StudyTableQty);
                    
                    Item.add(temp);
                    
                    
                    System.out.println("StudyTable"+"Type: "+StudyTableType+" Quantity: "+StudyTableQty);
                }
                
                
                //ADDING DONATION IN DATABASE
                if(Id.addDonation(Email,Item))
                {
                    MailDAO.sendMail(Email,"Donation Request Received","Dear Hope we have received your donation request,our volunteer will contact you soon for donation pickup.<br><br><h3>For Further Queries Please Call Us +91-9109104350.<br>Regards Rope Of Hope.</h3>");
                    response.sendRedirect("DonationSuccess.html");
                }
                else
                {
                    response.sendRedirect("Error.html");
                }                
            }
            catch(Exception E)
            {
                System.out.println("Error in InventoryDonationAdd.java "+ E.getMessage() );
                E.printStackTrace();
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
