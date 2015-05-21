package tienda;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Principal {

	Productos productoUno = new Productos(001);
	Productos productoDos = new Productos(002);
	Productos productoTres = new Productos(003);

	Clientes clienteUno = new Clientes(10001);
	Clientes clienteDos = new Clientes(10002);
	Clientes clienteTres = new Clientes(10003);

	Vendedores vendedorUno = new Vendedores(11);
	Vendedores vendedorDos = new Vendedores(22);
	Vendedores vendedorTres = new Vendedores(33);

	Tiendas tiendaUno = new Tiendas(11011);
	Tiendas tiendaDos = new Tiendas(220022);
	Tiendas tiendaTres = new Tiendas(330033);

	public void realizaVenta() {

		if (productoUno.getId_Producto() != 0) {

			System.out.println("El id del producto vendido es : "
					+ productoUno.getId_Producto());

		} else {

			System.out.println("Error en la obtención del id del producto");

		}

		if (clienteUno.getId_cliente() != 0) {

			System.out.println("El id del cliente es : "
					+ clienteUno.getId_cliente());

		} else {

			System.out.println("Error en la obtención del id del cliente");

		}

		if (vendedorUno.getId_Vendedor() != 0) {

			System.out.println("El id del vendedor es : "
					+ vendedorUno.getId_Vendedor());

		} else {

			System.out.println("Error en la obtención del id del vendedor");

		}

		if (tiendaUno.getId_tienda() != 0) {

			System.out.println("El id de la tienda es : "
					+ tiendaUno.getId_tienda());

		} else {

			System.out.println("Error en la obtención del id de la tienda");

		}

		Date now = new Date(System.currentTimeMillis());
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");

		System.out.println(date.format(now));
		System.out.println(hour.format(now));
		System.out.println(now);
	}

}