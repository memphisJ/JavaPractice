package Inventario;

/**
 * Created by hmartinez on 7/9/2019.
 */
public class Medicamento implements Producto{
    private String nombreMedicamento;
    private String codigo;
    private String laboratorio;
    private Integer cantidad;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public float calculoDeUnidades() {
        System.out.println("Obteniendo las unidades de medicamentos.");
        return getCantidad() * 15/100;
    }

    public int getCantidadMinima() {
        return 0;
    }
}
