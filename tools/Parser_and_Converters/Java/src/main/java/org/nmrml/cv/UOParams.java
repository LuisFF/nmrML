package org.nmrml.cv;

/**
 * Created with IntelliJ IDEA.
 * User: ldpf
 * Date: 27/09/2013
 * Time: 12:00
 * To change this template use File | Settings | File Templates.
 */

public enum UOParams {

    PPM("UO","UO_0000169","parts per million"),
    HERTZ("UO","UO_0000106","Hertz"),
    DEGREE("UO", "UO_0000185", "degree"),
    DIMENSIONLESS("UO", "UO_0000186", "dimensionless unit");



    private String ontology;
    private String termId;
    private String description;

    private UOParams(String ontology, String termId, String description) {
        this.ontology = ontology;
        this.termId = termId;
        this.description = description;
    }

    public String getOntology() {
        return ontology;
    }

    public String getTermId() {
        return termId;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        System.out.println(UOParams.PPM);
        System.out.println(UOParams.HERTZ.getTermId());
    }
}
