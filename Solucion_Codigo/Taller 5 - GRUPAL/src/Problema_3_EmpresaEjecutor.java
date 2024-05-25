import java.util.Scanner;
public class Problema_3_EmpresaEjecutor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Problema_3_Empresa arrayEmpresas[] = new Problema_3_Empresa[2];      
        for (int i = 0; i < arrayEmpresas.length; i++) {
            arrayEmpresas[i] = new Problema_3_Empresa("Empresa "+(i+1), "029"+(int)(Math.random()*999999+100000)+"001", ((int)(Math.random()*2+1)== 1)? "Loja":"Cuenca", (int)(Math.random()*5+1));
            //System.out.println(arrayEmpresas[i]);
            Problema_3_Departamento arrayDepartamentosEmpresa[] = new Problema_3_Departamento[arrayEmpresas[i].getNumeroDepartamentos()];
            for (int j = 0; j < arrayDepartamentosEmpresa.length; j++) {
                arrayDepartamentosEmpresa[j] = new Problema_3_Departamento("Departamento "+(j+1));
                System.out.println("Por favor ingrese el numero de empleados del "+arrayDepartamentosEmpresa[j].getNombreDepartamento()+" ["+arrayEmpresas[i].getNombreEmpresa()+"]");
                arrayDepartamentosEmpresa[j].setNumEmpleadosDepartamento(teclado.nextInt());
                System.out.println("Por favor ingrese la produccion anual del "+arrayDepartamentosEmpresa[j].getNombreDepartamento()+" ["+arrayEmpresas[i].getNombreEmpresa()+"]");
                arrayDepartamentosEmpresa[j].setProduccionAnual(teclado.nextInt());
                arrayDepartamentosEmpresa[j].asignarCategoriaDepartamento();
            }
            System.out.println("-----------------------"+arrayEmpresas[i].getNombreEmpresa()+"-----------------------");
            System.out.println(arrayEmpresas[i]);
            System.out.println("----------Departamentos:");
            for (Problema_3_Departamento departamento : arrayDepartamentosEmpresa)
                System.out.println(departamento);
            System.out.println("-------------------------------------------------------");
        }
    }
}
