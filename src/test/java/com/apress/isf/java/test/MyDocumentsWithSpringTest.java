package com.apress.isf.java.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by seoungjuhyun on 10/28/15.
 */
@SuppressWarnings("ALL")
public class MyDocumentsWithSpringTest {

    private ClassPathXmlApplicationContext context;
    private SearchEngine engine;
    private Type documentType;

    /**
     *
     */
    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext(
                "META-INF/spring/mydocuments-context.xml");
        engine = context.getBean(SearchEngine.class);
        documentType = context.getBean(Type.class);
    }

    @Test
    public void testWithSpringFindByType() {
        List<Document> documents = engine.findByType(documentType);
        assertNotNull(documents);
        assertTrue(documents.size() == 2);
        assertEquals(documentType.getName(),
                documents.get(0).getType().getName());
        assertEquals(documentType.getDesc(),
                documents.get(0).getType().getDesc());
        assertEquals(documentType.getExtension(),
                documents.get(0).getType().getExtension());
    }

    @Test
    public void testWithSpringListAll() {
        List<Document> documents = engine.listAll();
        assertNotNull(documents);
        assertTrue(documents.size() == 4);
    }
}
