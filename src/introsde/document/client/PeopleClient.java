package introsde.document.client;

import introsde.document.model.Person;
import introsde.document.ws.People;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class PeopleClient{
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:6902/ws/people?wsdl");
        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.document.introsde/", "PeopleService");
        Service service = Service.create(url, qname);

        People people = service.getPort(People.class);
        Person p = people.readPerson(1);
        List<Person> pList = people.readPersonList();
        System.out.println("Result ==> "+p.getName());
//        System.out.println("Result ==> "+pList);
//        System.out.println("First Person in the list ==> ");
//        System.out.println(pList.get(0).getBirthdate());
//        System.out.println(pList.get(0).getEmail());
//        System.out.println(pList.get(0).getIdPerson());
//        System.out.println(pList.get(0).getName());
//        System.out.println("Measures ==> ");
//        System.out.println(pList.get(0).getCurrentHealth().get(0).getDate());
//        System.out.println(pList.get(0).getCurrentHealth().get(0).getType());
//        System.out.println(pList.get(0).getCurrentHealth().get(0).getValue());
//        System.out.println(pList.get(0).getCurrentHealth().get(1).getDate());
//        System.out.println(pList.get(0).getCurrentHealth().get(1).getType());
//        System.out.println(pList.get(0).getCurrentHealth().get(1).getValue());
        
    }
}