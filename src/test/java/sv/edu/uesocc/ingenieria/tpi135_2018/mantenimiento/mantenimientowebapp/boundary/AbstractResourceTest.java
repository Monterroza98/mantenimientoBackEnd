/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.MarcaFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Marca;

/**
 *
 * @author aviles
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(MarcaFacadeLocal.class)
public class AbstractResourceTest {

    final MarcaFacadeLocal mockmarcafacadelocal = Mockito.mock(MarcaFacadeLocal.class);

    public static List<Marca> marcas() {
        List<Marca> marcas = new ArrayList<>();
        List<String> nombres = Arrays.asList("HP", "DELL", "TOSHIBA");
        for (int i = 0; i < nombres.size(); i++) {
            Marca m = new Marca();
            m.setIdMarca(i + 1);
            m.setNombre(nombres.get(i));
            marcas.add(m);
        }
        return marcas;
    }

    public AbstractResourceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Mockito.when(this.mockmarcafacadelocal.findAll()).thenReturn(marcas());
        Mockito.when(this.mockmarcafacadelocal.count()).thenReturn(marcas().size());
        Mockito.when(this.mockmarcafacadelocal.crear(Matchers.any(Marca.class))).thenReturn(marcas().get(0));
        Mockito.when(this.mockmarcafacadelocal.findRange(Matchers.anyInt(), Matchers.anyInt())).thenReturn(marcas());
        Mockito.when(this.mockmarcafacadelocal.find(Matchers.anyInt())).thenReturn(marcas().get(0));
        Mockito.when(this.mockmarcafacadelocal.editar(Matchers.any(Marca.class))).thenReturn(marcas().get(0));
        Mockito.when(this.mockmarcafacadelocal.remove(Matchers.any(Marca.class))).thenReturn(Boolean.TRUE);
    }

    @After
    public void tearDown() {
    }

//    /**
//     * Test of getFacade method, of class AbstractResource.
//     */
//    @Test
//    public void testGetFacade() {
//        System.out.println("getFacade");
//        AbstractResource instance = new AbstractResourceImpl();
//        AbstractInterface expResult = null;
//        AbstractInterface result = instance.getFacade();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of findAll method, of class AbstractResource.
     * @throws java.lang.Exception
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        List<Marca> expResult = marcas();
        List<Marca> result = instance.findAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of findRange method, of class AbstractResource.
     * @throws java.lang.Exception
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 5;
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        List<Marca> expResult = marcas();
        List<Marca> result = instance.findRange(first, pageSize);
        assertEquals(expResult, result);
    }

    /**
     * Test of count method, of class AbstractResource.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        Integer expResult = marcas().size();
        Integer result = instance.count();
        assertEquals(expResult, result);
    }

    /**
     * Test of findById method, of class AbstractResource.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        Integer id = 1;
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        Marca expResult = marcas().get(0);
        Marca result = instance.findById(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class AbstractResource.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Marca registro = marcas().get(0);
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        Marca expResult = marcas().get(0);
        Marca result = instance.create(registro);
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class AbstractResource.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("editElement");
        Marca registro = marcas().get(0);
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        Marca expResult = marcas().get(0);
        Marca result = instance.edit(registro);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class AbstractResource.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("deleteElement");
        Integer id = 1;
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        Marca expResult = marcas().get(0);
        Marca result = instance.delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of crearNuevo method, of class AbstractResource.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCrearNuevo() throws Exception {
        System.out.println("crearNuevo");
        Marca registro = marcas().get(0);
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        Marca expResult = marcas().get(0);
        Marca result = instance.create(registro);
        assertEquals(expResult, result);
    }

}
