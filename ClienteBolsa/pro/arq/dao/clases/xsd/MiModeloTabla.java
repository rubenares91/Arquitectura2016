
package pro.arq.dao.clases.xsd;

import javax.swing.table.DefaultTableModel;

public class MiModeloTabla extends DefaultTableModel
{
    @Override
    public boolean isCellEditable(int row, int column)
    {
        return false;
    }

}

