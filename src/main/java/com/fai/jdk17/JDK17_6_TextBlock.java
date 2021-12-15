package com.fai.jdk17;

public class JDK17_6_TextBlock {

    public static void main(String[] args) {

        String str = "select " +
                "id, " +
                "code, " +
                "description, " +
                "channel, " +
                "fee_strategy_type, " +
                "msg_template_source, " +
                "msg_template_dest, " +
                "msg_template_fee_source, " +
                "ft_default, " +
                "join_fee, " +
                "type, " +
                "active, " +
                "destination_account, " +
                "fee_included, " +
                "offus_host_priority, " +
                "offus_host " +
                "from mst_product " +
                "where ft_default = true and type = ? fetch first 1 rows only";


        String textBlock = """
                select 
                    id, 
                    code, 
                    description, 
                    channel, 
                    fee_strategy_type, 
                    msg_template_source, 
                    msg_template_dest, 
                    msg_template_fee_source, 
                    ft_default, 
                    join_fee, 
                    type, 
                    active, 
                    destination_account, 
                    fee_included, 
                    offus_host_priority, 
                    offus_host 
                from mst_product 
                where ft_default = true and type = ? fetch first 1 rows only
                """;

        System.out.println(textBlock);

    }

}


