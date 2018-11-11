package tech.zg.patterns.structure.structure4_composite_patterns;

/**
 * 测试入口
 * <p>
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("深圳总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("华南分公司");
        comp.add(new HrDepartment("华南分公司人力资源部"));
        comp.add(new FinanceDepartment("华南分公司财务部"));
        root.add(comp);

        ConcreteCompany compPart1 = new ConcreteCompany("佛山办事处");
        compPart1.add(new HrDepartment("佛山办事处人力资源部"));
        compPart1.add(new FinanceDepartment("佛山办事处财务部"));
        comp.add(compPart1);

        ConcreteCompany compPart2 = new ConcreteCompany("顺德办事处");
        compPart2.add(new HrDepartment("顺德办事处人力资源部"));
        compPart2.add(new FinanceDepartment("顺德办事处财务部"));
        comp.add(compPart2);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("职责：");
        root.doSomething();
    }
}
