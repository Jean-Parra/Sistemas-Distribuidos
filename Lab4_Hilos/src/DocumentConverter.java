import java.util.List;
import java.util.ArrayList; 
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.concurrent.Callable;

import com.sun.star.frame.Desktop;
import com.sun.star.lang.XComponent;
import com.sun.star.beans.PropertyValue;
import com.sun.star.document.XFilter;
import com.sun.star.document.XExporter;
import com.sun.star.lang.XComponent;
import com.sun.star.lang.XMultiComponentFactory;

public class DocumentConverter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    List<String> inputFiles = new ArrayList<>();
    
    System.out.println("Ingresa las ubicacion de los documentos (escribe 'fin' para terminar):");
    
    while (true) {
    
      String input = scanner.nextLine().trim();
      
      if (input.equalsIgnoreCase("fin")) {
        break;
      }
      
      inputFiles.add(input);
      
    }
    
    scanner.close();

    ExecutorService executor = Executors.newFixedThreadPool(3);

    List<String> pdfFiles = executor.invokeAll(inputFiles.stream()
        .map(file -> callableToFilePDF(file))
        .collect(Collectors.toList()))
        .stream()
        .map(future -> future.get())
        .collect(Collectors.toList());
        
    executor.shutdown();

    System.out.println("PDF files created:");
    pdfFiles.forEach(file -> System.out.println(file));

  }

  private static Callable<String> callableToFilePDF(String inputFile) {

    return () -> {

      Desktop desktop = Desktop.getDesktop();
      
      Document document = desktop.openDoc(inputFile);
      
      PDFExportFilter pdfFilter = (PDFExportFilter)desktop.getFilterFormat("writer_pdf_Export");
      
      pdfFilter.setExportBookmarks(true);

      String outputPdf = inputFile.replaceAll("\\.\\w+$", ".pdf");

      pdfFilter.filter(document);
      
      document.storeAsFile(outputPdf);
      
      document.close();
      
      return outputPdf;

    };

  }

}